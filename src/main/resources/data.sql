insert into amount_boundary_bean(currency, min_amount, max_amount, date_insertion)
values ('FCFA', 1, 1000, Now());
insert into amount_boundary_bean(currency, min_amount, max_amount, date_insertion)
values ('USD', 2, 2000, Now());
insert into amount_boundary_bean(currency, min_amount, max_amount, date_insertion)
values ('EUR', 3, 3000, Now());

insert into volatility_boundary_bean(currency_from, currency_to, min_bounded, max_bounded, date_insertion)
values ('FCFA', 'USD', 6, 60, Now());
insert into volatility_boundary_bean(currency_from, currency_to, min_bounded, max_bounded, date_insertion)
values ('USD', 'FCFA', 10, 200, Now());
insert into volatility_boundary_bean(currency_from, currency_to, min_bounded, max_bounded, date_insertion)
values ('EUR', 'USD', 17, 300, Now());