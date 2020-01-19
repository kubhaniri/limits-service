insert into amount_boundary_bean(currency, min_amount, max_amount, date_insertion, port)
values ('FCFA', 1, 1000, Now(), 0);
insert into amount_boundary_bean(currency, min_amount, max_amount, date_insertion, port)
values ('USD', 2, 2000, Now(), 0);
insert into amount_boundary_bean(currency, min_amount, max_amount, date_insertion, port)
values ('EUR', 3, 3000, Now(), 0);

insert into volatility_boundary_bean(currency_from, currency_to, min_bounded, max_bounded, date_insertion, port)
values ('FCFA', 'USD', 6, 60, Now(), 0);
insert into volatility_boundary_bean(currency_from, currency_to, min_bounded, max_bounded, date_insertion, port)
values ('USD', 'FCFA', 10, 200, Now(), 0);
insert into volatility_boundary_bean(currency_from, currency_to, min_bounded, max_bounded, date_insertion, port)
values ('EUR', 'USD', 17, 300, Now(), 0);